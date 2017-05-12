package com.example.bishe111;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {

//需要到达的目的地的个数
	private  int num;
	
    public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	//保存到达的目的地
	private  List<Vertex> mudi=new ArrayList<Vertex>();

	//获取目的节点
    public List<Vertex> getMudi() {
		return mudi;
		
	}
	
	/*
     * 顶点
     */
    private List<Vertex> vertexs;

    /*
     * 边
     */
    private int[][] edges;
//头结点
/*    Vertex Head_element;
   
    public Vertex getHead_element() {
		return Head_element;
	}

	public void setHead_element(Vertex head_element) {
		Head_element = head_element;
	}
	*/
    
	/*
     * 没有访问的顶点
     */
    private Queue<Vertex> unVisited;

    public Graph(List<Vertex> vertexs, int[][] edges) {
        this.vertexs = vertexs;
        this.edges = edges;
    }
    
    /*
     * 搜索各顶点最短路径
     */
    public void search(){
        while(num!=0){
        	
           Vertex vertex = unVisited.element();//element头结点
        
            //顶点已经计算出最短路径，设置为"已访问"
          vertex.setMarked(true);
             
            //获取所有"未访问"的邻居
            List<Vertex> neighbors = getNeighbors(vertex);    
            
            //更新邻居的最短路径
            updatesDistance(vertex, neighbors);      
            
            //到达的点为目的节点
            if(vertex.IsClient==true)
            {
            	//将目的地添加到mudi中
            	mudi.add(vertex);
            	//设置为起点
            	vertex.setPath(0);
            	num--;
            	vertex.IsClient=false;
            	search();
            }
            pop();
        }
        System.out.println("search over");
    }
  
    
    /*
     * 更新所有邻居的最短路径
     */
    private void updatesDistance(Vertex vertex, List<Vertex> neighbors){
        for(Vertex neighbor: neighbors){
            updateDistance(vertex, neighbor);
        }
    }
    
    /*
     * 更新邻居的最短路径
     */
    private void updateDistance(Vertex vertex, Vertex neighbor){
        int distance = getDistance(vertex, neighbor) + vertex.getPath();
        if(distance < neighbor.getPath()){
            neighbor.setPath(distance);
        }
    }

    /*
     * 初始化未访问顶点集合
     */
    public void initUnVisited(Vertex head) {
        unVisited = new PriorityQueue<Vertex>();
        unVisited.add(head);
        
        for(Vertex v : vertexs)
        {
        	if(v.toString().equals(head.toString()))
        	{
        		continue;
        	}
        	unVisited.add(v);
        }
    }

    /*
     * 从未访问顶点集合中删除已找到最短路径的节点
     */
    private void pop() {
        unVisited.poll();
    }

    /*
     * 获取顶点到目标顶点的距离
     */
    private int getDistance(Vertex source, Vertex destination) {
        int sourceIndex = vertexs.indexOf(source);
        int destIndex = vertexs.indexOf(destination);
        return edges[sourceIndex][destIndex];
    }

    /*
     * 获取顶点所有(未访问的)邻居
     */
    private List<Vertex> getNeighbors(Vertex v) {
        List<Vertex> neighbors = new ArrayList<Vertex>();
        int position = vertexs.indexOf(v);
        Vertex neighbor = null;
        int distance;
        for (int i = 0; i < vertexs.size(); i++) {
            if (i == position) {
                //顶点本身，跳过
                continue;
            }
            distance = edges[position][i];    //到所有顶点的距离
            if (distance < Integer.MAX_VALUE) {
                //是邻居(有路径可达)
                neighbor = getVertex(i);
                if (!neighbor.isMarked) {
                    //如果邻居没有访问过，则加入list,neighbors;
                    neighbors.add(neighbor);
                }
            }
        }
        return neighbors;
    }

    /*
     * 根据顶点位置获取顶点
     */
    private Vertex getVertex(int index) {
        return vertexs.get(index);
    }
}
