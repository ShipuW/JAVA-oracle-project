var _area_choose = {
	provid:'prov',		//省份下拉框id
	univid:'univ',		//学校下拉框id
	depaid:'depa',		//学院下拉框id
	majoid:'majo'       //专业下拉框id
}
_area_choose.area      = new Array();
_area_choose.area[1]  = ['北京',['北京大学',['计算机学院',['计算机科学与技术']]],['中国人民大学',['通信工程学院']],['清华大学',['建筑学院']]];
_area_choose.area[2]  = ['天津',['南开大学',['外国语学院']],['天津大学',['光电工程学院']]];
_area_choose.area[3]  = ['上海',['复旦大学'],['上海交通大学']];
_area_choose.area[4]  = ['重庆',['重庆大学',['光电工程学院','通信工程学院','计算机学院','自动化学院','软件学院','外国语学院']],['重庆邮电大学',['通信工程学院','通信类','通信工程','电子信息工程','信息工程','广播电视工程'],['计算机科学与技术学院','计算机与智能科学类','计算机科学与技术','计算机科学与技术专业卓越工程师班','信息安全','网络工程','智能科学与技术','地理信息系统'],['自动化学院','自动化与电气工程类','自动化','电气工程与自动化','物联网工程','智能电网信息工程','测控技术与仪器','机械设计制造及其自动化'],['光电学院/国际半导体学院','电气工程类','集成电路工程类','光信息科学与技术','电子科学与技术','电磁场与无线技术','微电子学','电子信息科学与技术'],['传媒艺术学院','艺术设计类','广播电视编导','动画','视觉传达设计','环境设计','产品设计'],['法学院','法学类','法学','知识产权'],['经济管理学院','会计学','工商管理','市场营销','工程管理','信息管理与信息系统','电子商务','经济学','物流管理'],['生物信息学院','生物技术与制药类','生物医学工程','生物技术','生物信息学','制药工程'],['外国语学院/国际学院','英语类','英语','翻译'],['软件学院','软件工程'],['体育学院','社会体育指导与管理'],['国际学院','中加合作人才培养'],['数理学院','信息与计算科学','数学与应用数学','应用物理学']]];
_area_choose.area[5]  = ['河北'];
_area_choose.area[6]  = ['山西'];
$(document).ready(
	function()
	{
		$.extend(
		{
			areainit:function(pid,uid,did,mid)
			{
				$("#"+_area_choose.provid).append("<option value='0'>省市名称</option>");
				$("#"+_area_choose.univid).append("<option value='0'>学校名称</option>");
				$("#"+_area_choose.depaid).append("<option value='0'>学院名称</option>");
				$("#"+_area_choose.majoid).append("<option value='0'>专业名称</option>");
				if( pid == 0 && uid == 0 && did == 0 && mid==0)
				{
					//初始化省份下拉
					$.each(_area_choose.area,
						function(i,n)
						{
							if(typeof n != 'undefined')
								$("#"+_area_choose.provid).append("<option value='"+i+"'>"+n[0]+"</option>");
						}
					);
					
				}
				else
				{
					//初始化已选省份数据
					$.each(_area_choose.area,
						function(i,n)
						{
							if(i == pid)
							{
								if(typeof n != 'undefined')
									$("#"+_area_choose.provid).append("<option value='"+i+"' selected>"+n[0]+"</option>");
							}
							else
							{
								if(typeof n != 'undefined')
									$("#"+_area_choose.provid).append("<option value='"+i+"' >"+n[0]+"</option>");
							}
						}
					);
					
					//初始化已选学校数据
					if(uid > 0)
					{
						var university = uid.replace(pid,'');
						$.each(_area_choose.area[pid],
							function(i,n)
							{
								if(i > 0)
								{
									if(i == university)
									{
										if(typeof n != 'undefined')
											$("#"+_area_choose.univid).append("<option value='"+pid+"00"+i+"' selected>"+n[0]+"</option>");
									}
									else
									{
										if(typeof n != 'undefined')
											$("#"+_area_choose.univid).append("<option value='"+pid+"00"+i+"'>"+n[0]+"</option>");
									}
								}
							}
						);
					}
					
					//初始化已选学院数据
					if(did > 0)
					{
						var university = uid.replace(pid,'');
						var department = did.replace(uid,'');
						$.each(_area_choose.area[pid][university],
							function(i,n)
							{
								if(i > 0)
								{
									if(i == department)
									{
										if(typeof n != 'undefined')
											$("#"+_area_choose.depaid).append("<option value='"+uid+"00"+i+"' selected>"+n[0]+"</option>");
									}
									else
									{
										if(typeof n != 'undefined')
											$("#"+_area_choose.depaid).append("<option value='"+uid+"00"+i+"'>"+n[0]+"</option>");
									}
								}
							}
						);
					}
					//初始化已选专业数据
						if(mid > 0)
					{
						var university = uid.replace(pid,'');
						var department = did.replace(uid,'');
						var major = mid.replace(did,'');
						$.each(_area_choose.area[pid][university][department],
							function(i,n)
							{
								if(i > 0)
								{
									if(i == major)
									{
										if(typeof n != 'undefined')
											$("#"+_area_choose.majoid).append("<option value='"+did+"00"+i+"' selected>"+n+"</option>");
									}
									else
									{
										if(typeof n != 'undefined')
											$("#"+_area_choose.majoid).append("<option value='"+did+"00"+i+"'>"+n+"</option>");
									}
								}
							}
						);
					}
				}
			}
		}
		);
		
		
		//当省份数据发生变化时，重置学校选择
		$("#"+_area_choose.provid).live('change',
			function()
			{
				var pid = $(this).val();
				$("#"+_area_choose.univid).html("").append("<option value='0'>学校名称</option>");
				$("#"+_area_choose.depaid).html("").append("<option value='0'>学院名称</option>");
				$("#"+_area_choose.majoid).html("").append("<option value='0'>专业名称</option>");
				if(pid > 0)
				{
					$.each(_area_choose.area[pid],
						function(i,n)
						{
							if(i > 0)
							{
								if(typeof n != 'undefined')
									$("#"+_area_choose.univid).append("<option value='"+pid+"00"+i+"'>"+n[0]+"</option>");
							}
						}
					);
				}
			}
		);
		
		//当学校数据发生变化时，重置学院选择
		$("#"+_area_choose.univid).live('change',
			function()
			{
				var pid = $("#"+_area_choose.provid).val();
				var uid = $(this).val();
				var university = uid.replace(pid+"00",'');
				$("#"+_area_choose.depaid).html("").append("<option value='0'>学院名称</option>");
				$("#"+_area_choose.majoid).html("").append("<option value='0'>专业名称</option>");
				if(uid > 0)
				{
					$.each(_area_choose.area[pid][university],
						function(i,n)
						{
							if(i > 0)
							{
								if(typeof n != 'undefined')
									$("#"+_area_choose.depaid).append("<option value='"+uid+"00"+i+"'>"+n[0]+"</option>");
							}
						}
					);
				}
			}
		);
		//当学院数据发生变化时，重置专业选择
		$("#"+_area_choose.depaid).live('change',
			function()
			{
			    var pid = $("#"+_area_choose.provid).val();
				var uid = $("#"+_area_choose.univid).val();
				var did = $(this).val();
				var university = uid.replace(pid+"00",'');
				var department = did.replace(uid+"00",'');
				$("#"+_area_choose.majoid).html("").append("<option value='0'>专业名称</option>");
				if(did > 0)
				{
					$.each(_area_choose.area[pid][university][department],
						function(i,n)
						{
							if(i > 0)
							{
								if(typeof n != 'undefined')
									$("#"+_area_choose.majoid).append("<option value='"+did+"00"+i+"'>"+n+"</option>");
							}
						}
					);
				}
			}
		);
		
	}
);