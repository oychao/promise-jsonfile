package interceptors;

import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletionStage;

/**
 * Created by ouyangcharles on 5/25/16.
 */
public class VerboseAction extends Action.Simple {
    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        try {
            System.out.println("This is " + VerboseAction.class.getName());
            return delegate.call(ctx);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
