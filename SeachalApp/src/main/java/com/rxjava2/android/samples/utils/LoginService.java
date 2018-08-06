//package com.rxjava2.android.samples.utils;
//
//
//import com.rxjava2.android.samples.model.User;
//
//import io.reactivex.Observable;
//import retrofit2.http.POST;
//import retrofit2.http.Query;
//
//
///**
// * 登录接口
// * Created by findvoid on 16/9/12.
// */
//
//public interface LoginService {
//
//
//    /**
//     * 非CAS登录
//     *
//     * @return
//     */
//    @POST("core/login")
//    Observable<User> login(@Query("userCode") String userCode, @Query("pwd") String pwd, @Query("deviceId") String deviceId);
//
//}
