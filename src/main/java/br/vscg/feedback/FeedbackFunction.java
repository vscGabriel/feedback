package br.vscg.feedback;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

public class FeedbackFunction {

    @FunctionName("feedbackPOST")
    public HttpResponseMessage runPost(
            @HttpTrigger(
                    name = "req",
                    methods = {HttpMethod.POST},
                    authLevel = AuthorizationLevel.ANONYMOUS,
                    route = "feedback"
            ) HttpRequestMessage<String> request,
            ExecutionContext context
    ) {
        context.getLogger().info("Processando Feedback");

        return request
                .createResponseBuilder(HttpStatus.OK)
                .body("Qualquer coisa 1 ")
                .build();
    }

    @FunctionName("feedbackGET")
    public HttpResponseMessage runGet(
            @HttpTrigger(
                    name = "get",
                    methods = {HttpMethod.GET},
                    authLevel = AuthorizationLevel.ANONYMOUS,
                    route = "feedback"
            ) HttpRequestMessage<String> request,
            ExecutionContext context
    ) {
        context.getLogger().info("Processando Feedback");

        return request
                .createResponseBuilder(HttpStatus.OK)
                .body("Qualquer coisa2")
                .build();
    }
}