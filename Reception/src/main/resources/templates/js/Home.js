$('.cmt_ul li').live('mouseover',function(){
    $(this).addClass('cmt_current');
    $(this).siblings().removeClass('cmt_current');
    var slide_index = $('.cmt_ul li').index($(this));
    var slide_show = $('.cmt_ul').siblings('div').eq(slide_index);
    slide_show.show();
    slide_show.siblings('div').hide();
    $(this).trigger('click');
})
//显示模态框
function modalOpen() {
    //获取模态框对象   getElementsByClassName获取到的是一个数组对象
    let modal = document.getElementsByClassName("modal-box")[0];
    let o_mask = document.getElementsByClassName("o_mask")[0];
    //获取浏览器当前宽高
    let documentWidth = window.innerWidth;
    let documentHeight = window.innerHeight;
    //获取模态框宽度
    let modalWidth = modal.offsetWidth;
    //模态框距离浏览器右侧的距离就是（浏览器宽度-模态框宽）/ 2.0
    //注意，需要把结果转为字符串类型
    modal.style.left = ((documentWidth - modalWidth) / 2.0).toString();
    //设置为可见
    modal.style.visibility = "visible";
    o_mask.style.visibility = "visible";
}

//模态框关闭
function modalClose() {
    //获取模态框
    let modal = document.getElementsByClassName("modal-box")[0];
    let o_mask = document.getElementsByClassName("o_mask")[0];
    //设置为不可见
    modal.style.visibility = "hidden";
    o_mask.style.visibility = "hidden";
}

$(function () {
    var error = document.getElementById("error").value;
    // alert(error);
    if (error == "" || error == "正确") {

    } else {
        alert(error);
    }
})






