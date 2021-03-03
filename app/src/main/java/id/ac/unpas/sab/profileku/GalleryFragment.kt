package id.ac.unpas.sab.profileku

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class GalleryFragment : Fragment() {
    override fun onCreateView(infalter: LayoutInflater, container: ViewGroup?, SavedInstanceState: Bundle?): View? {
        return LayoutInflater.from(ContactFragment.mainActiviy).inflate(R.layout.fragment_profile, container,false)
    }
    companion object{
        lateinit var mainActiviy: MainActivity
        fun newInstance(activity:MainActivity): GalleryFragment{
            mainActiviy = activity
            return  GalleryFragment()
        }
    }
}