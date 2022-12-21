package edu.mailman.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// import androidx.recyclerview.widget.LinearLayoutManager
import edu.mailman.recyclerviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = MainAdapter(TaskList.taskList)
        /* Alternative to declaring the layout manager in the xml file
        binding?.rvTask?.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false) */
        binding?.rvTask?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}