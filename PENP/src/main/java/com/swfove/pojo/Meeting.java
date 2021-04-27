package com.swfove.pojo;

import org.apache.ibatis.type.Alias;

import java.util.Date;
public class Meeting {
    private int meetingId;
    private String meetingType;
    private String meetingName;
    private Date meetingEstimatedStartTime;
    private Date meetingEstimatedEndTime;
    private Date meetingOfficialStartTime;
    private Date meetingOfficialEndTime;
    private String meetingVenue;
    private String meetingOrganizationalUnit;
    private String meetingSupportUnit;
    private Date meetingListCollectionPreliminaryD;
    private Date meetingListCollectionMetaphaseD;
    private Date meetingListCollectionFinalD;
    private Date meetingListReviewD;
    private int meetingParticipantsQuota;
    private int meetingAccompanyQuota;
    private String meetingRemarks;
    private String meetingProductGroup;

    public Meeting() {
    }

    public Meeting(int meetingId, String meetingType, String meetingName, Date meetingEstimatedStartTime, Date meetingEstimatedEndTime, Date meetingOfficialStartTime, Date meetingOfficialEndTime, String meetingVenue, String meetingOrganizationalUnit, String meetingSupportUnit, Date meetingListCollectionPreliminaryD, Date meetingListCollectionMetaphaseD, Date meetingListCollectionFinalD, Date meetingListReviewD, int meetingParticipantsQuota, int meetingAccompanyQuota, String meetingRemarks, String meetingProductGroup) {
        this.meetingId = meetingId;
        this.meetingType = meetingType;
        this.meetingName = meetingName;
        this.meetingEstimatedStartTime = meetingEstimatedStartTime;
        this.meetingEstimatedEndTime = meetingEstimatedEndTime;
        this.meetingOfficialStartTime = meetingOfficialStartTime;
        this.meetingOfficialEndTime = meetingOfficialEndTime;
        this.meetingVenue = meetingVenue;
        this.meetingOrganizationalUnit = meetingOrganizationalUnit;
        this.meetingSupportUnit = meetingSupportUnit;
        this.meetingListCollectionPreliminaryD = meetingListCollectionPreliminaryD;
        this.meetingListCollectionMetaphaseD = meetingListCollectionMetaphaseD;
        this.meetingListCollectionFinalD = meetingListCollectionFinalD;
        this.meetingListReviewD = meetingListReviewD;
        this.meetingParticipantsQuota = meetingParticipantsQuota;
        this.meetingAccompanyQuota = meetingAccompanyQuota;
        this.meetingRemarks = meetingRemarks;
        this.meetingProductGroup = meetingProductGroup;
    }

    public int getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(int meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public Date getMeetingEstimatedStartTime() {
        return meetingEstimatedStartTime;
    }

    public void setMeetingEstimatedStartTime(Date meetingEstimatedStartTime) {
        this.meetingEstimatedStartTime = meetingEstimatedStartTime;
    }

    public Date getMeetingEstimatedEndTime() {
        return meetingEstimatedEndTime;
    }

    public void setMeetingEstimatedEndTime(Date meetingEstimatedEndTime) {
        this.meetingEstimatedEndTime = meetingEstimatedEndTime;
    }

    public Date getMeetingOfficialStartTime() {
        return meetingOfficialStartTime;
    }

    public void setMeetingOfficialStartTime(Date meetingOfficialStartTime) {
        this.meetingOfficialStartTime = meetingOfficialStartTime;
    }

    public Date getMeetingOfficialEndTime() {
        return meetingOfficialEndTime;
    }

    public void setMeetingOfficialEndTime(Date meetingOfficialEndTime) {
        this.meetingOfficialEndTime = meetingOfficialEndTime;
    }

    public String getMeetingVenue() {
        return meetingVenue;
    }

    public void setMeetingVenue(String meetingVenue) {
        this.meetingVenue = meetingVenue;
    }

    public String getMeetingOrganizationalUnit() {
        return meetingOrganizationalUnit;
    }

    public void setMeetingOrganizationalUnit(String meetingOrganizationalUnit) {
        this.meetingOrganizationalUnit = meetingOrganizationalUnit;
    }

    public String getMeetingSupportUnit() {
        return meetingSupportUnit;
    }

    public void setMeetingSupportUnit(String meetingSupportUnit) {
        this.meetingSupportUnit = meetingSupportUnit;
    }

    public Date getMeetingListCollectionPreliminaryD() {
        return meetingListCollectionPreliminaryD;
    }

    public void setMeetingListCollectionPreliminaryD(Date meetingListCollectionPreliminaryD) {
        this.meetingListCollectionPreliminaryD = meetingListCollectionPreliminaryD;
    }

    public Date getMeetingListCollectionMetaphaseD() {
        return meetingListCollectionMetaphaseD;
    }

    public void setMeetingListCollectionMetaphaseD(Date meetingListCollectionMetaphaseD) {
        this.meetingListCollectionMetaphaseD = meetingListCollectionMetaphaseD;
    }

    public Date getMeetingListCollectionFinalD() {
        return meetingListCollectionFinalD;
    }

    public void setMeetingListCollectionFinalD(Date meetingListCollectionFinalD) {
        this.meetingListCollectionFinalD = meetingListCollectionFinalD;
    }

    public Date getMeetingListReviewD() {
        return meetingListReviewD;
    }

    public void setMeetingListReviewD(Date meetingListReviewD) {
        this.meetingListReviewD = meetingListReviewD;
    }

    public int getMeetingParticipantsQuota() {
        return meetingParticipantsQuota;
    }

    public void setMeetingParticipantsQuota(int meetingParticipantsQuota) {
        this.meetingParticipantsQuota = meetingParticipantsQuota;
    }

    public int getMeetingAccompanyQuota() {
        return meetingAccompanyQuota;
    }

    public void setMeetingAccompanyQuota(int meetingAccompanyQuota) {
        this.meetingAccompanyQuota = meetingAccompanyQuota;
    }

    public String getMeetingRemarks() {
        return meetingRemarks;
    }

    public void setMeetingRemarks(String meetingRemarks) {
        this.meetingRemarks = meetingRemarks;
    }

    public String getMeetingProductGroup() {
        return meetingProductGroup;
    }

    public void setMeetingProductGroup(String meetingProductGroup) {
        this.meetingProductGroup = meetingProductGroup;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "meetingId=" + meetingId +
                ", meetingType='" + meetingType + '\'' +
                ", meetingName='" + meetingName + '\'' +
                ", meetingEstimatedStartTime=" + meetingEstimatedStartTime +
                ", meetingEstimatedEndTime=" + meetingEstimatedEndTime +
                ", meetingOfficialStartTime=" + meetingOfficialStartTime +
                ", meetingOfficialEndTime=" + meetingOfficialEndTime +
                ", meetingVenue='" + meetingVenue + '\'' +
                ", meetingOrganizationalUnit='" + meetingOrganizationalUnit + '\'' +
                ", meetingSupportUnit='" + meetingSupportUnit + '\'' +
                ", meetingListCollectionPreliminaryD=" + meetingListCollectionPreliminaryD +
                ", meetingListCollectionMetaphaseD=" + meetingListCollectionMetaphaseD +
                ", meetingListCollectionFinalD=" + meetingListCollectionFinalD +
                ", meetingListReviewD=" + meetingListReviewD +
                ", meetingParticipantsQuota=" + meetingParticipantsQuota +
                ", meetingAccompanyQuota=" + meetingAccompanyQuota +
                ", meetingRemarks='" + meetingRemarks + '\'' +
                ", meetingProductGroup='" + meetingProductGroup + '\'' +
                '}';
    }
}

