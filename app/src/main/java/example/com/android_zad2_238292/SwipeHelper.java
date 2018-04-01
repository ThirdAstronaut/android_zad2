package example.com.android_zad2_238292;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by Rafał on 2018-03-27.
 */

public class SwipeHelper extends ItemTouchHelper.SimpleCallback {

   private CustomAdapter mCustomAdapter;
   public SwipeHelper(int dragDirs, int swipeDirs) {
        super(dragDirs, swipeDirs);
    }

    public SwipeHelper(CustomAdapter customAdapter) {
        super(ItemTouchHelper.UP | ItemTouchHelper.DOWN, ItemTouchHelper.LEFT);
        mCustomAdapter = customAdapter;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        mCustomAdapter.removeItem(viewHolder.getAdapterPosition());
    }
}
