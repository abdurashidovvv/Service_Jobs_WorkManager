package com.abdurashidov.service_jobs_workmanager

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkRequest
import com.abdurashidov.service_jobs_workmanager.databinding.ActivityMain2Binding
import java.util.concurrent.TimeUnit

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    @SuppressLint("ServiceCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


//        //Job service
        /*
        val jobScheduler = getSystemService(JOB_SCHEDULER_SERVICE) as JobScheduler
        val jobInfo = JobInfo.Builder(1, ComponentName(this, MyJobService::class.java))
        val job = jobInfo.setMinimumLatency(1)
            .setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY)
            .setOverrideDeadline(60000)
            .build()

        binding.start.setOnClickListener {
            jobScheduler.schedule(job)
        }

        binding.stop.setOnClickListener {
            jobScheduler.cancel(1)
        }
        */



    //Firebse jobdispatchers
        //Foydalana olmadim



        //WorkManager
        binding.start.setOnClickListener {

            val workRequest:WorkRequest= PeriodicWorkRequestBuilder<UploadWork>(15, TimeUnit.MINUTES)
                .setInitialDelay(1, TimeUnit.MINUTES)
                .build()
            WorkManager.getInstance(this).enqueue(workRequest)


        }
    

    }
}