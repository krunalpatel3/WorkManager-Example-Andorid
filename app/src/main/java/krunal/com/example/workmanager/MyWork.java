package krunal.com.example.workmanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWork extends Worker {

    private static final String TAB = MyWork.class.getSimpleName();

    public MyWork(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        Log.e(TAB,"Working in BackGround");

        return Result.success();
    }
}
