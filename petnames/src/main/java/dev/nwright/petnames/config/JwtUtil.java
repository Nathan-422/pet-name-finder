// Commenting out file
// package dev.nwright.petnames.config;
//
// import io.jsonwebtoken.Claims;
// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.security.Keys;
// import io.jsonwebtoken.SignatureAlgorithm;
//
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.stereotype.Service;
//
// import java.util.Date;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.concurrent.TimeUnit;
// import java.util.function.Function;
//
// import javax.crypto.SecretKey;
//
// import java.security.Key;
//
// @Service
// public class JwtUtil {
//
// // TODO Make a real secret key and hide it from github!!!
// private final String SECRET_KEY =
// "4390q7ghr4lknvasio4rkjlhfbndvsaasdf23ern0a789wcffjqfk34hg9087qhwef";
// // private final Key key = SECRET_KEY;
// private final SecretKey signingKey = Jwts.SIG.HS256.key().build();
//
// public String extractUsername(String token) {
// return extractClaim(token, Claims::getSubject);
// }
//
// public Date extractExpiration(String token) {
// return extractClaim(token, Claims::getExpiration);
// }
//
// public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
// final Claims claims = extractAllClaims(token);
// return claimsResolver.apply(claims);
// }
//
// private Claims extractAllClaims(String token) {
// return Jwts.parser()
// .verifyWith(this.signingKey)
// .build()
// .parseSignedClaims(token)
// .getPayload();
// }
//
// private Boolean isTokenExpired(String token) {
// return extractExpiration(token).before(new Date());
// }
//
// public String generateToken(UserDetails userDetails) {
// Map<String, Object> claims = new HashMap<>();
// return createToken(claims, userDetails.getUsername());
// }
//
// private String createToken(Map<String, Object> claims, String subject) {
// return Jwts.builder()
// .subject(subject)
// .claims(claims)
// .issuedAt(new Date(System.currentTimeMillis()))
// .expiration(new Date(System.currentTimeMillis() +
// TimeUnit.HOURS.toMillis(24)))
// .signWith(signingKey)
// .compact();
// }
//
// public Boolean validateToken(String token, UserDetails userDetails) {
// final String username = extractUsername(token);
// // TODO: this is not doing anything yet
// Jwts.parser()
// .verifyWith(this.signingKey)
// .build()
// .parseSignedClaims(token)
// .getPayload()
// .getSubject()
// .equals("Joe");
// return (username.equals(userDetails.getUsername()) &&
// !isTokenExpired(token));
// }
// }
