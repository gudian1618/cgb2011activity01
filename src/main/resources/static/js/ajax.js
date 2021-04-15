// 定义ajax的get请求函数
function doAjaxGet(url, params, callback) {
    // debugger
    // 1.创建ajax异步请求对象(这也是ajax技术应用的入口对象)
    var xhr = new XMLHttpRequest();
    // 2.设置请求,响应过程的状态监听(通过回调函数处理状态变化)
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4 && xhr.status == 200) {
            // 4 表示通信结束
            // 200 表示服务端响应ok
            // 服务端响应的结果会传递给XHR对象,我们可以借助response获取响应结果
            // console.log("response text", xhr.responseText)
            // xhr.responseText用于获取服务端的响应结果
            callback(xhr.responseText);

        }
    };
    // 3.创建或打开与服务端的链接(设置同步或异步)
    // true表示同步
    xhr.open("GET", url + "?" + params, true);
    // 4.发送异步请求
    // Get请求send方法中不传递数据
    xhr.send(null)
}

function doAjaxPost(url, params, callback) {
    // debugger
    // 1.创建ajax异步请求对象(这也是ajax技术应用的入口对象)
    var xhr = new XMLHttpRequest();
    // 2.设置请求,响应过程的状态监听(通过回调函数处理状态变化)
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4 && xhr.status == 200) {
            // 4 表示通信结束
            // 200 表示服务端响应ok
            // 服务端响应的结果会传递给XHR对象,我们可以借助response获取响应结果
            // console.log("response text", xhr.responseText)
            // xhr.responseText用于获取服务端的响应结果
            callback(xhr.responseText);
        }
    };
    // 3.创建或打开与服务端的链接(设置同步或异步)
    xhr.open("POST", url, true);
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    // 4.发送异步post请求
    xhr.send(params);
}
