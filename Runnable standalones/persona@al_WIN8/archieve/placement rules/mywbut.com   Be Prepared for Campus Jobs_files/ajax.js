// JavaScript Document
var xmlhttp;
var temp1, temp2, temp3;
// 
function GetXmlHttpObject_Scriptgiant()
{
	var xmlHttp1=null;
	try 
	{
		xmlHttp1 = new XMLHttpRequest(); // Firefox, Opera 8.0+, Safari
	} 
	catch (e) 
	{
		//Internet Explorer
		try 
		{
			xmlHttp1 = new ActiveXObject("Msxml2.XMLHTTP");
		} 
		catch (e)
		{
			xmlHttp1 = new ActiveXObject("Microsoft.XMLHTTP");
		}
	}
	return xmlHttp1;
}
// Front Page Tab
function open_tabs(tab_number)
{
	xmlhttp=GetXmlHttpObject_Scriptgiant()
	if (xmlhttp==null)
	 {
		 alert ("Browser does not support HTTP Request")
		 return false;
	 }
	var url='back_tab.php?tab_number='+tab_number;
	xmlhttp.onreadystatechange=function()
	{
		if (xmlhttp.readyState==4 || xmlhttp.readyState=="complete")
		{
			document.getElementById("targetTabId").innerHTML=xmlhttp.responseText;
		}
		else
		{
			document.getElementById("targetTabId").innerHTML='<p align="center"><img src="images/loading.gif" alt="Loading" border="0" \/><\/p>';
		}
	}
	xmlhttp.open("GET",url,true);
	xmlhttp.send(null)
}
