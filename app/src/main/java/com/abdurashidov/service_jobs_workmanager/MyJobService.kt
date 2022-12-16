package com.abdurashidov.service_jobs_workmanager

import android.app.Service
import android.app.job.JobParameters
import android.app.job.JobService
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MyJobService : JobService() {
    override fun onStartJob(params: JobParameters?): Boolean {
        Toast.makeText(this, "Job service is starting", Toast.LENGTH_SHORT).show()
        return true
    }

    override fun onStopJob(params: JobParameters?): Boolean {
        Toast.makeText(this, "Job service is stopping", Toast.LENGTH_SHORT).show()
        return true
    }


}