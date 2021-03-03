package no.sintef.api;

import no.sintef.api.user.UserController;
import io.javalin.Javalin;
import io.javalin.plugin.openapi.OpenApiOptions;
import io.javalin.plugin.openapi.OpenApiPlugin;
import io.javalin.plugin.openapi.ui.ReDocOptions;
import io.javalin.plugin.openapi.ui.SwaggerOptions;
import io.swagger.v3.oas.models.info.Info;

import static io.javalin.apibuilder.ApiBuilder.*;


public class OpenApiEndpoint {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.registerPlugin(getConfiguredOpenApiPlugin());
            config.defaultContentType = "application/json";
        }).routes(() -> {
            path("users", () -> {
                get(UserController::getAll);
                post(UserController::create);
                path(":userId", () -> {
                    get(UserController::getOne);
                    patch(UserController::update);
                    delete(UserController::delete);
                });
            });
        }).start(7002);
        app.get("/", ctx -> ctx.result("Hello World"));
        System.out.println("Check out ReDoc docs at http://localhost:7002/redoc");
        System.out.println("Check out Swagger UI docs at http://localhost:7002/swagger-ui");
    }

    private static OpenApiPlugin getConfiguredOpenApiPlugin() {
        Info info = new Info().version("1.0").title("SINTEF semantic matching API").description("User API");
        OpenApiOptions options = new OpenApiOptions(info)
                .activateAnnotationScanningFor("no.sintef.api")
                .path("/swagger-docs") // endpoint for OpenAPI json
                .swagger(new SwaggerOptions("/swagger-ui")) // endpoint for swagger-ui
                .reDoc(new ReDocOptions("/redoc")) // endpoint for redoc
                .defaultDocumentation(doc -> {
                    doc.json("500", ErrorResponse.class);
                    doc.json("503", ErrorResponse.class);
                });
        return new OpenApiPlugin(options);
    }

}