package com.it.crowd.dao;

import com.it.crowd.entity.Auth;
import com.it.crowd.entity.AuthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthMapper
{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbg.generated Sat Dec 19 10:26:25 CST 2020
     */
    long countByExample(AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbg.generated Sat Dec 19 10:26:25 CST 2020
     */
    int deleteByExample(AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbg.generated Sat Dec 19 10:26:25 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbg.generated Sat Dec 19 10:26:25 CST 2020
     */
    int insert(Auth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbg.generated Sat Dec 19 10:26:25 CST 2020
     */
    int insertSelective(Auth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbg.generated Sat Dec 19 10:26:25 CST 2020
     */
    List<Auth> selectByExample(AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbg.generated Sat Dec 19 10:26:25 CST 2020
     */
    Auth selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbg.generated Sat Dec 19 10:26:25 CST 2020
     */
    int updateByExampleSelective(@Param("record") Auth record, @Param("example") AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbg.generated Sat Dec 19 10:26:25 CST 2020
     */
    int updateByExample(@Param("record") Auth record, @Param("example") AuthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbg.generated Sat Dec 19 10:26:25 CST 2020
     */
    int updateByPrimaryKeySelective(Auth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_auth
     *
     * @mbg.generated Sat Dec 19 10:26:25 CST 2020
     */
    int updateByPrimaryKey(Auth record);

    List<Integer> selectAssignedAuthIdByRoleId(Integer roleId);

    void deleteOldRelationShip(Integer roleId);

    void insertNewRelationShip(@Param("roleId") Integer roleId,@Param("authIdArray") List<Integer> authIdArray);

    List<String> selectAssignedAuthNameByAdminId(Integer adminId);
}