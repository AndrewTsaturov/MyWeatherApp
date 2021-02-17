package com.begeton.presentation.platform

import android.app.Activity
import android.app.DownloadManager
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import io.reactivex.disposables.CompositeDisposable


abstract class BaseFragment : Fragment() {

    companion object {
        const val PROGRESS_DIALOG_TAG = "progress"
        const val BOTTOM_SHEET_ALERT_DIALOG = "bottom_sheet"
        const val CUSTOM_ALERT_TAG = "custom_alert"
    }

    val disposables = CompositeDisposable()

    private val showDialog = MutableLiveData<Boolean>().apply {

    }

    protected abstract val layoutId: Int
    protected open val availableDrawer: Boolean = false

    private var toast: Toast? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bundle = Bundle()
//        bundle.putString(FirebaseAnalytics.Param.SCREEN_NAME, javaClass.simpleName)
//        bundle.putString(FirebaseAnalytics.Param.SCREEN_CLASS, javaClass.simpleName)
//        FirebaseAnalytics.getInstance(requireContext()).logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle)
    }

    override fun onStop() {
        super.onStop()

        hideKeyboard(requireActivity())
    }

    fun showMessage(@StringRes messageId: Int?) {
        messageId?.let { showMessage(getString(messageId)) }
    }

    protected fun showMessage(message: String?) {
        if (message.isNullOrBlank()) {
            return
        }
        toast?.cancel()
        toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
        toast?.show()
    }


    protected fun hideKeyboard(activity: Activity?) {
        if (activity != null) {
            val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            var view = activity.currentFocus
            if (view == null) {
                view = View(activity)
            }
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    fun hideKeyboardDialogs(activity: Activity?, view: View) {
        if (activity != null) {
            val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    protected fun navigate(navDirections: NavDirections) {
        findNavController().navigate(navDirections)
    }

//    open fun saveImage(imageUrl: String, filename: String?) {}
//
//    protected fun loadToGallery(imageUrl: String, filename: String? = null) { loadImageFromUrl(
//        imageUrl,
//        filename
//    ) }

//    protected fun showProgressDialog(progress: Boolean) {
//        val progressDialogFragment = childFragmentManager.findFragmentByTag(PROGRESS_DIALOG_TAG) as ProgressDialogFragment?
//
//        if (!progress && progressDialogFragment != null) {
//            progressDialogFragment.dismissAllowingStateLoss()
//
//            childFragmentManager.executePendingTransactions()
//        } else if (progressDialogFragment == null && progress) {
//            ProgressDialogFragment().show(childFragmentManager, PROGRESS_DIALOG_TAG)
//
//            childFragmentManager.executePendingTransactions()
//        }
//    }

    protected fun showDialogFragment(dialogFragment: DialogFragment, tag: String) {
        val dialog = childFragmentManager.findFragmentByTag(tag) as DialogFragment?

        if (dialog != null) {
            dialog.dismissAllowingStateLoss()

            childFragmentManager.executePendingTransactions()
        } else {
            dialogFragment.show(childFragmentManager, tag)

            childFragmentManager.executePendingTransactions()
        }
    }

    protected fun showBottomSheet(bottomSheet: BottomSheetDialogFragment, tag: String) {
        val dialog = childFragmentManager.findFragmentByTag(tag) as BottomSheetDialogFragment?

        if (dialog != null) {
            dialog.dismissAllowingStateLoss()

            childFragmentManager.executePendingTransactions()
        } else {
            bottomSheet.show(childFragmentManager, tag)

            childFragmentManager.executePendingTransactions()
        }
    }

    fun openDownloads(){
        val intent = Intent(DownloadManager.ACTION_VIEW_DOWNLOADS).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }

        startActivity(intent)
    }

//    fun showDialog(){
//        try {
//            AlertDialog.Builder(requireContext())
//                .setMessage("Файл сохранен. Открыть папку \"Загрузки\"?")
//                .setPositiveButton(R.string.yes){ dialog, which -> openDownloads()}
//                .setNegativeButton(R.string.no){ dialog, which -> dialog.dismiss() }
//                .show()
//            showDialog.postValue(false)
//        } catch (e: Exception){
//            e.printStackTrace()
//            Toast.makeText(
//                requireContext(),
//                "Файл сохранен, для просмотра, перейдите в паку загрузки",
//                Toast.LENGTH_LONG
//            ).show()
//            showDialog.postValue(false)
//        }
//    }



//    private fun showMessage(messageResId: Int, actionString: String, positiveActionFun:(action: String) -> Unit) =
//        AlertDialog.Builder(requireContext()).apply {
//            setMessage(getString(messageResId))
//            setNegativeButton(R.string.no){ dialog, _ ->  dialog.dismiss()}
//            setPositiveButton(R.string.yes){ dialog, which ->
//                dialog.dismiss()
//                positiveActionFun.invoke(actionString)
//            }
//            show()
            }

