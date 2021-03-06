package com.oprisklib.constant;

public enum WXEventKeyType {
	SCAN_BORROW("scan_borrow",1),
	SCAN_RETURN("scan_return",2),
	SEARCH_BY_BOOKNAME("search_by_bookname", 3),
	SEARCH_BY_AUTHOR("search_by_author",4),
	SEARCH_BY_OWNER("search_by_owner",5),
	SCAN_INPUT_BOOK("scan_input_book",6),
	SCAN_DESC("scan_desc", 7);
	
	private String name;
	private int index;
	
	private WXEventKeyType(String name,int index){
		this.name = name;
		this.index = index;
	};
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public static WXEventKeyType getWXEventKeyTypeByName(String name){
		for (WXEventKeyType key : WXEventKeyType.values()) {
            if (key.getName().equalsIgnoreCase(name)) {
                return key;
            }
        }
		
		return null;
	}
}
