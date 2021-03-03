package id.ac.unpas.sab.profileku

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer

class ProfileFragment : Fragment() {
    override fun onCreateView(infalter: LayoutInflater, container: ViewGroup?, SavedInstanceState: Bundle?): View? {
        return LayoutInflater.from(ContactFragment.mainActiviy).inflate(R.layout.fragment_profile, container,false)
    }
    companion object{
        lateinit var mainActiviy: MainActivity
        fun newInstance(activity:MainActivity): ProfileFragment{
            mainActiviy = activity
            return  ProfileFragment()
        }
    }
}