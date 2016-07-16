package kale.ui.block;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import kale.ui.R;
import kale.ui.uiblock.UiBlock;

/**
 * @author Jack Tony
 * @date 2015/9/22
 */
public class DemoInnerUiBlock extends UiBlock {

    private static final String TAG = "DemoInnerUiBlock";
    
    @Override
    protected int getLayoutResId() {
        return R.layout.demo_activity;
    }

    @Override
    public void bindViews(View rootView) {
        Log.d(TAG, "bindViews: ");
    }

    @Override
    public void setViews() {
        ((TextView) getView(R.id.inner_tv)).setText(R.string.test_text);
    }

    @Override
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent: ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState() called with: " + "outState = [" + outState + "]");
    }
    
    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState() called with: " + "savedInstanceState = [" + savedInstanceState + "]");
    }
}
