$('.cmt_ul li').live('mouseover',function(){
    $(this).addClass('cmt_current');
    $(this).siblings().removeClass('cmt_current');
    var slide_index = $('.cmt_ul li').index($(this));
    var slide_show = $('.cmt_ul').siblings('div').eq(slide_index);
    slide_show.show();
    slide_show.siblings('div').hide();
    $(this).trigger('click');
})
