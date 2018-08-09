package krunal.com.example.workmanager;

import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;

public class MyWorkB extends Worker {

    private static final String TAB = MyWorkB.class.getSimpleName();

    @NonNull
    @Override
    public Result doWork() {

        Log.e(TAB,"My WorkB");

        return Result.SUCCESS;
    }
}
