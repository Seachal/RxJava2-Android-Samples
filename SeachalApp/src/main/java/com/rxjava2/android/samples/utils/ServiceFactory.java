//package com.rxjava2.android.samples.utils;
//
//import com.ctitc.deep.DeepApp;
//import com.ctitc.deep.base.retrofit.converter.FastJsonConverterFactory;
//import com.ctitc.deep.constant.Config;
//
//import retrofit2.Retrofit;
//import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
//
//public class ServiceFactory {
//
//    public ServiceFactory() {
//
//    }
//
//    private static class SingletonHolder {
//        private static final ServiceFactory INSTANCE = new ServiceFactory();
//    }
//
//    public static ServiceFactory getInstance() {
//        return SingletonHolder.INSTANCE;
//    }
//
//    /**
//     * 创建一个service
//     *
//     * @param serviceClass
//     * @param <T>
//     * @return
//     */
//    public <T> T createService(Class<T> serviceClass) {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(Config.BASE_DEEP_URL)
//                .client(DeepApp.getInstance().getOkHttpClient())
//                .addConverterFactory(FastJsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .build();
//        return retrofit.create(serviceClass);
//    }
//
//    /**
//     * 通过静态方法创建service
//     * @param serviceClass
//     * @param <T>
//     * @return
//     */
//    public static  <T> T create(Class<T> serviceClass){
//       return ServiceFactory.getInstance().createService(serviceClass) ;
//    }
//}
