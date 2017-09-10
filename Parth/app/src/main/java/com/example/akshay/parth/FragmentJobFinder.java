package com.example.akshay.parth;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akshay on 10/9/17.
 */

public class FragmentJobFinder extends Fragment implements AdapterJobs.ListItemClickListener{
    private RecyclerView mJobsRecyclerView;
    ArrayList<JobSeekerInfo> infolist;
    public  FragmentJobFinder(){
        infolist=new ArrayList<>();
        infolist.add(new JobSeekerInfo("hunn"));
        infolist.add(new JobSeekerInfo("hunn"));
        infolist.add(new JobSeekerInfo("hunn"));
        infolist.add(new JobSeekerInfo("hunn"));
        infolist.add(new JobSeekerInfo("hunn"));




    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.jobs_fragment,container,false);


        mJobsRecyclerView=rootView.findViewById(R.id.Jobs_RecyclerView);
        LinearLayoutManager linearlayout=new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false);
        mJobsRecyclerView.setLayoutManager(linearlayout);


        for(JobSeekerInfo i:infolist ){
            Log.i("message",i.getNameUser());
            Log.i("message",String.valueOf(infolist.size()));
        }


        AdapterJobs mJobsAdapter=new AdapterJobs(infolist, this);
        mJobsRecyclerView.setAdapter(mJobsAdapter);

        return rootView;
    }

    @Override
    public void OnListItemClick(String phnNumber, int index) {
        if(index==0){
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"+phnNumber));
            startActivity(intent);

        }
        else if(index==1){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("sms:"+phnNumber));
            startActivity(intent);



        }
        else{
            Intent i=new Intent(getActivity(),JobDescription.class);
            startActivity(i);

        }

    }
}
