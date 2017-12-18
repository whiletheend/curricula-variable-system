package edu.model;

/**
 * 选课信息参数模型
 * 
 * @author wgt
 * @date 17-12-14
 */
public class CurriculaVariableInfoParam {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curricula_variable_info.id
     *
     * @mbggenerated
     */
    private int id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curricula_variable_info.c_c_no
     *
     * @mbggenerated
     */
    private int cCNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curricula_variable_info.c_s_no
     *
     * @mbggenerated
     */
    private int cSNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curricula_variable_info.c_t_no
     *
     * @mbggenerated
     */
    private int cTNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curricula_variable_info.c_mark
     *
     * @mbggenerated
     */
    private int cMark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column curricula_variable_info.c_status
     *
     * @mbggenerated
     */
    private String cStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getcCNo() {
        return cCNo;
    }

    public void setcCNo(int cCNo) {
        this.cCNo = cCNo;
    }

    public int getcSNo() {
        return cSNo;
    }

    public void setcSNo(int cSNo) {
        this.cSNo = cSNo;
    }

    public int getcTNo() {
        return cTNo;
    }

    public void setcTNo(int cTNo) {
        this.cTNo = cTNo;
    }

    public int getcMark() {
        return cMark;
    }

    public void setcMark(int cMark) {
        this.cMark = cMark;
    }

    public String getcStatus() {
        return cStatus;
    }

    public void setcStatus(String cStatus) {
        this.cStatus = cStatus;
    }
}
