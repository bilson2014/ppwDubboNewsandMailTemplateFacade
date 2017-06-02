package com.paipianwang.pat.facade.information.entity;

import org.apache.solr.client.solrj.beans.Field;

import com.paipianwang.pat.common.entity.BaseEntity;

public class PmsProductSolr extends BaseEntity{

	private static final long serialVersionUID = -3365175562854271223L;

	@Field
	private String productId = null; // 视频ID
	
	@Field
	private String productName = null; // 视频名称
	
	@Field
	private String pDescription = null; // 视频描述
	
	@Field
	private String picLDUrl = null; // 海报
	
	@Field
	private float orignalPrice = 0f; // 原价
	
	@Field
	private float price = 0f; // 打折之后的价格
	
	@Field
	private long length = 0l; // 长度
	
	@Field
	private String teamId = null; // 团队ID
	
	@Field
	private String teamName = null; // 团队名称
	
	@Field
	private String itemId = null; // 类型ID
	
	@Field
	private String itemName = null; // 类型名称
	
	@Field
	private String tags = null; // 标签

	private String condition = null; // 搜索条件
	
	@Field
	private long total = 0l; // 总数
	
	@Field
	private Integer recommend = null; // 推荐值
	
	@Field
	private Integer supportCount = null; //相同推荐值的排序
	
	@Field
	private String updateDate = null;//作品修改时间
	
	@Field
	private String creationTime = null;//作品创建时间
	
	@Field
	private String teamPhotoUrl = null; // 供应商头像
	
	@Field
	private String indentProjectId = null; // 项目ID
	
	@Field
	private String teamFlag = null; // 作品状态
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getpDescription() {
		return pDescription;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getPicLDUrl() {
		return picLDUrl;
	}

	public void setPicLDUrl(String picLDUrl) {
		this.picLDUrl = picLDUrl;
	}

	public float getOrignalPrice() {
		return orignalPrice;
	}

	public void setOrignalPrice(float orignalPrice) {
		this.orignalPrice = orignalPrice;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public Integer getRecommend() {
		return recommend;
	}

	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}

	public Integer getSupportCount() {
		return supportCount;
	}

	public void setSupportCount(Integer supportCount) {
		this.supportCount = supportCount;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getTeamPhotoUrl() {
		return teamPhotoUrl;
	}

	public void setTeamPhotoUrl(String teamPhotoUrl) {
		this.teamPhotoUrl = teamPhotoUrl;
	}

	public String getIndentProjectId() {
		return indentProjectId;
	}

	public void setIndentProjectId(String indentProjectId) {
		this.indentProjectId = indentProjectId;
	}

	public String getTeamFlag() {
		return teamFlag;
	}

	public void setTeamFlag(String teamFlag) {
		this.teamFlag = teamFlag;
	}
	
}
