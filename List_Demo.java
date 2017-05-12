package com.example.bishe111;

import java.util.ArrayList;
import java.util.List;

public class List_Demo {
	List<Vertex> vertexs = new ArrayList<Vertex>();
    Vertex xinanmen = new Vertex("xinanmen");
    Vertex dongnanmen = new Vertex("dongnanmen");
    Vertex daxueshengyushi = new Vertex("daxueshengyushi");
    Vertex jiaofulou = new Vertex("jiaofulou");
    Vertex yinshifuwuzhongxin = new Vertex("yinshifuwuzhongxin");
    Vertex tiyuzhongxin = new Vertex("tiyuzhongxin");
    Vertex baoweichu = new Vertex("baoweichu");
    Vertex jingjiguanlixueyuan = new Vertex("jingjiguanlixueyuan");
    Vertex zhujiaolou = new Vertex("zhujiaolou");
    Vertex  dongdalou= new Vertex("dongdalou");
    Vertex xidalou = new Vertex("xidalou");
    public void add() {
    	vertexs.add(xinanmen);
	    vertexs.add(dongnanmen);
	    vertexs.add(daxueshengyushi);
	    vertexs.add(jiaofulou);
	    vertexs.add(yinshifuwuzhongxin);
	    vertexs.add(tiyuzhongxin);
	    vertexs.add(baoweichu);
	    vertexs.add(jingjiguanlixueyuan);
	    vertexs.add(zhujiaolou);
	    vertexs.add(dongdalou);
	    vertexs.add(xidalou);	
	}
    
    int[][] edges = {
    		{0,923,133,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,1676,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
			{923,0,1056,Integer.MAX_VALUE,551,1332,Integer.MAX_VALUE,2184,2535,2194,3107},
			{133,Integer.MAX_VALUE,0,1071,Integer.MAX_VALUE,864,1543,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
			{Integer.MAX_VALUE,1478,1071,0,1373,348,Integer.MAX_VALUE,1209,Integer.MAX_VALUE,2323,Integer.MAX_VALUE},
			{Integer.MAX_VALUE,551,Integer.MAX_VALUE,1373,0,1289,Integer.MAX_VALUE,1979,2323,1639,2896},
			{Integer.MAX_VALUE,1332,864,348,1289,0,1276,861,Integer.MAX_VALUE,2259,Integer.MAX_VALUE},
			{1676,Integer.MAX_VALUE,1543,Integer.MAX_VALUE,Integer.MAX_VALUE,1276,0,836,Integer.MAX_VALUE,Integer.MAX_VALUE,501},
			{Integer.MAX_VALUE,2184,Integer.MAX_VALUE,1209,1979,861,836,0,565,1588,916},
			{Integer.MAX_VALUE,2535,Integer.MAX_VALUE,Integer.MAX_VALUE,2323,Integer.MAX_VALUE,Integer.MAX_VALUE,565,0,1352,901},
			{Integer.MAX_VALUE,2194,Integer.MAX_VALUE,2343,1639,2259,Integer.MAX_VALUE,1588,1352,0,1924},
			{Integer.MAX_VALUE,3107,Integer.MAX_VALUE,Integer.MAX_VALUE,2896,Integer.MAX_VALUE,501,916,901,1924,0}
    
    };

}
