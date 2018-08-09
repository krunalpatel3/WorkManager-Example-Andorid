package krunal.com.example.workmanager;

import android.support.annotation.NonNull;
import android.util.Log;
import androidx.work.Worker;

public class MyWork extends Worker {

    private static final String TAB = MyWork.class.getSimpleName();

    @NonNull
    @Override
    public Result doWork() {

        Log.e(TAB,"Working in BackGround");

        return Result.SUCCESS;
    }
}
