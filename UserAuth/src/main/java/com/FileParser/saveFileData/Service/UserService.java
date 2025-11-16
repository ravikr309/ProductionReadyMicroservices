public class UserService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;;

    private static final String user_key = "user:";


    @CacheEvict(value = "users", key ="#user_id")
    public void saveUser(User user){
        redisTemplate.opsForValue().set(user_key + user.getId(), user);
    }


    //Applying Caching here
    @Cacheable(value = "users", key = "#id")
    public User getUSer(String id){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return (user) redisTemplate.opsForValue().get(user_key + id);
    }


   



}
