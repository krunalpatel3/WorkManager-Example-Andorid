package krunal.com.example.workmanager;

import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;

public class MyWorkA extends Worker {

    private static final String TAB = MyWorkA.class.getSimpleName();

    @NonNull
    @Override
    public Result doWork() {

        Log.e(TAB,"My WorkA");

        return Result.SUCCESS;
    }
}
