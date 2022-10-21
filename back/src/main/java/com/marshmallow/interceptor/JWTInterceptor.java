//package com.marshmallow.interceptor;
//
//import com.dangdang.member.exception.NotValidateAccessToken;
//import com.dangdang.util.JWTUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@Component
//public class JWTInterceptor implements HandlerInterceptor {
//    private static final String HEADER_AUTH = "Authorization";
//
//    @Autowired
//    private JWTUtil jwtUtil;
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        if (request.getMethod().equals("OPTIONS")) {
//            return true;
//        }
//        String token = request.getHeader(HEADER_AUTH);
//        token = token.substring(7,token.length()); // 토큰 앞에 `Bearer ` 붙어서 넘어오니까 제거해주고 토큰 확인
//        if(token != null){
//            if(jwtUtil.validateTokenExpiration(token)){
//                return true;
//            }else{
//                throw new NotValidateAccessToken();
//            }
//        }
//        throw new Exception("유효하지 않은 접근입니다.");
//    }
//}
//
