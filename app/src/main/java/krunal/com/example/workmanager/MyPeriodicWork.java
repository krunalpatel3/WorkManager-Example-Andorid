package krunal.com.example.workmanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyPeriodicWork extends Worker {

    private static final String TAB = MyPeriodicWork.class.getSimpleName();

    public MyPeriodicWork(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }


    @NonNull
    @Override
    public Result doWork() {

        Log.e(TAB,"PeriodicWork in BackGround");

        return Result.success();
    }
}
