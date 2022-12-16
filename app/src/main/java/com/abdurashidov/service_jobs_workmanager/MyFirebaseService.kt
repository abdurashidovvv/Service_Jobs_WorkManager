package com.abdurashidov.service_jobs_workmanager

import android.app.job.JobParameters
import android.app.job.JobService
import android.util.Log
import android.widget.Toast


class MyFirebaseService : JobService() {
    private val TAG = "MyFirebaseService"
    override fun onStartJob(params: JobParameters?): Boolean {
        Log.d(TAG, "onStartJob: ")
        Toast.makeText(this, "Firebase jobdispatcher working", Toast.LENGTH_SHORT).show()
        return true
    }

    override fun onStopJob(params: JobParameters?): Boolean {
        Log.d(TAG, "onStopJob: ")
        Toast.makeText(this, "Firebase jobdispatcher working", Toast.LENGTH_SHORT).show()
        return true
    }
}