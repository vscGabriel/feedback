package br.vscg.feedback;

import br.vscg.feedback.model.dto.FeedbackRequestDTO;
import br.vscg.feedback.model.entity.FeedbackEntity;
import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;
import org.springframework.stereotype.Component;

@Component
public class FeedbackFunction extends FunctionInvoker<FeedbackRequestDTO, FeedbackEntity> {

    @FunctionName("feedback")
    public HttpResponseMessage run(
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
                .body("FUNCIONOU KCT")
                .build();
    }
}