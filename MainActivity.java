package com.example.bishe111;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	List_Demo list_Demo=	new List_Demo();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		list_Demo.add();
    Button button = (Button)findViewById(R.id.button6);
    button.setOnClickListener(new View.OnClickListener() {       	
        	@Override
     public void onClick(View v) {
		      List<Vertex> mudi_list=new ArrayList<>();
        	final EditText editText = (EditText)findViewById(R.id.editText);
        	final EditText editText1 = (EditText)findViewById(R.id.EditText_1);
        	String input = editText1.getText().toString();
        	Vertex head=null;
        	Graph graph= new Graph(list_Demo.vertexs, list_Demo.edges);
        	//出发点
        	Vertex input1 = new Vertex(input);
		      head=input1;
       		graph.initUnVisited(head);
       		 //目的地
        	String[] str=new String[50];
       		String input_1 = editText.getText().toString();
        	str=input_1.split(" ");
        	graph.setNum(str.length);      
       		for(int i=0;i<str.length;i++)
        	{
        		for(int j=0;j<list_Demo.vertexs.size();j++)
        		{
        			if(str[i].equals(list_Demo.vertexs.get(j).getName()))
        			{
        				list_Demo.vertexs.get(j).setIsClient(true);
        			}
        		}
       		}
         	//调用算法
        	graph.search();
        	//获得目的节点
        	mudi_list=graph.getMudi();     
        	//遍历mudi
        	StringBuffer ss1=new StringBuffer();       
        	for(int i=0;i<mudi_list.size();i++)
        	{
        		ss1.append(mudi_list.get(i).getName());
        		ss1.append(" ");
        	}
        	final String ss =ss1.toString();
          Intent intent = new Intent(MainActivity.this, SecondActivity.class);
          intent.putExtra("nameA", ss);
          startActivity(intent);
            }
        });             
  }
}
	
