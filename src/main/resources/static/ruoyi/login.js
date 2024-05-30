function login(){
        var username=$("#username").val();
        var password=$("#password").val();
        let  params={
            "username": username,
            "password" : password,
        };
        $.ajax({
            url: ctx + "login",
            type: 'post',
            data: params,
            success(res){
                if (res.code === 200){
                    location.href = ctx + 'index'
                }
            }
        })
    }
