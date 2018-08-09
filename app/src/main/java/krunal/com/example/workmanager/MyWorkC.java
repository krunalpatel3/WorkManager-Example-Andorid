package krunal.com.example.workmanager;

import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;

public class MyWorkC extends Worker {

    private static final String TAB = MyWorkC.class.getSimpleName();

    @NonNull
    @Override
    public Result doWork() {

        Log.e(TAB,"My WorkC");

        return Result.SUCCESS;
    }
}
