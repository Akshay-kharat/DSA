package com.jspiders.LinkedList;

public class SingleLinkedList {
	private int data;
	private SingleLinkedList node;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public SingleLinkedList getNode() {
		return node;
	}
	public void setNode(SingleLinkedList node) {
		this.node = node;
	}
	public SingleLinkedList(int data) {
		super();
		this.data = data;
	}
	
    
	
	//main Start
	public static void main(String[] args) {
		System.out.println("program Started...");
		SingleLinkedList singleLinkedList=new SingleLinkedList(45);
		System.out.println(singleLinkedList.getData());
		singleLinkedList.setNode(singleLinkedList);
	}
}
