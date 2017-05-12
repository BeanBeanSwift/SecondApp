package com.example.bishe111;
public class Vertex implements Comparable<Vertex>{

    /**
     * 节点名称(A,B,C,D)
     */
    private String name;
    
    public String getName() {
		return name;		
	}   
    //需要到达的目的地boolean值
    public boolean IsClient=false;   
	public boolean isIsClient() {
		return IsClient;
	}
	public void setIsClient(boolean isClient) {
		IsClient = isClient;
	}
	/**
     * 最短路径长度
     */
    private int path;
    public void setPath(int path) {
		this.path = path;
	}
    public int getPath() {
		return path;
	}    
    /**
     * 节点是否已经出列(是否已经处理完毕)
     */
    public boolean isMarked;  
    public void setMarked(boolean isMarked) {
		this.isMarked = isMarked;
	}    
    public Vertex(String name){
        this.name = name;
        this.path = Integer.MAX_VALUE; //初始设置为无穷大
        this.setMarked(false);
    }    
    public Vertex(String name, int path){
        this.name = name;
        this.path = path;
        this.setMarked(false);
    }    
    @Override
    public int compareTo(Vertex o) {
        return o.path > path?-1:1;
    }
}
