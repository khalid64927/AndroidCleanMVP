package be.vergauwen.simon.cleanmvp.ui

import android.util.Log
import be.vergauwen.simon.cleanmvp.mvp.MVPPresenter

class TestPresenter : MVPPresenter<TestContract.View>(), TestContract.Presenter {

  //////////////////////////////////////////////////////////////////////////////////////////////////
  // TestContract.Presenter Impl

  override fun loadThings() {
    Log.e("TestPresenter", ".loadThings()")
    getView()?.showThings()
  }
}