package krunal.com.example.workmanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWorkA extends Worker {

    private static final String TAB = MyWorkA.class.getSimpleName();

    public MyWorkA(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        Log.e(TAB,"My WorkA");

        return Result.success();
    }
}
