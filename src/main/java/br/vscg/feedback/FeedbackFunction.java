package br.vscg.feedback;

import br.vscg.feedback.model.dto.FeedbackRequestDTO;
import br.vscg.feedback.model.entity.FeedbackEntity;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

public class FeedbackFunction extends FunctionInvoker<FeedbackRequestDTO, FeedbackEntity> {

}