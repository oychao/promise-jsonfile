package interceptors;

import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletionStage;

/**
 * Created by ouyangcharles on 5/25/16.
 */
public class DebugAction extends Action<LogInfo> {
    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        if (configuration.value()){
            System.out.println("This is DebugAction string.");
        }
        return delegate.call(ctx);
    }
}
