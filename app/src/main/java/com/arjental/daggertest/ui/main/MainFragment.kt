package com.arjental.daggertest.ui.main

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arjental.daggertest.DaggerTstApp
import com.arjental.daggertest.R
import com.arjental.daggertest.SubforTesting
import javax.inject.Inject

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    @Inject
    lateinit var viewModel: MainViewModel

    @Inject
    lateinit var sft: SubforTesting

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as DaggerTstApp).appComponent.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        println("DAGGER OUT " + viewModel.s)
        println("DAGGER OUT " + viewModel.f)
        println("DAGGER OUT " + viewModel.riba.obj)
        println("DAGGER OUT " + sft.string)


    }

}