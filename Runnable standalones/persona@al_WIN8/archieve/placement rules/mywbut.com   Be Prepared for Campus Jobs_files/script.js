// JavaScript Document
// Back
function backPage()
{
history.back();	
}

// Email check1
function isEmail(emailstr) {
	var dotchar = emailstr.indexOf(".");
	var atchar = emailstr.indexOf("@");
	var dotlast = emailstr.lastIndexOf(".");
	var spacechar = emailstr.indexOf(" ");
	var len = emailstr.length;
	if( (dotchar == -1) || (atchar == -1) || (spacechar != -1) || (dotlast < atchar) || (dotlast == len - 1) ) {
		return false;
	}
	else {
		return true;
	}
}
// Email check2
function echeck(str) 
{
		var at="@"
		var dot="."
		var lat=str.indexOf(at)
		var lstr=str.length
		var ldot=str.indexOf(dot)
		if (str.indexOf(at)==-1){   return false }

		if (str.indexOf(at)==-1 || str.indexOf(at)==0 || str.indexOf(at)==lstr){   return false		}

		if (str.indexOf(dot)==-1 || str.indexOf(dot)==0 || str.indexOf(dot)==lstr){    return false	}
		
		if (str.indexOf(at,(lat+1))!=-1){   return false }

		if (str.substring(lat-1,lat)==dot || str.substring(lat+1,lat+2)==dot){    return false	 }
		
		if (str.indexOf(dot,(lat+2))==-1) {   return false }
		
		if (str.indexOf(" ")!=-1){   return false }

 		return true					
}

//Function for alpha-numeric|numeric check
function keyRestrict(e, validchars) 
{
	 var key='', keychar='';
	 key = getKeyCode(e);
	 if (key == null) return true;
	 keychar = String.fromCharCode(key);
	 keychar = keychar.toLowerCase();
	 validchars = validchars.toLowerCase();
	 if (validchars.indexOf(keychar) != -1)
	  return true;
	 if ( key==null || key==0 || key==8 || key==9 || key==13 || key==27 )
	  return true;
	 return false;
}
function getKeyCode(e)
{
	 if (window.event)
		return window.event.keyCode;
	 else if (e)
		return e.which;
	 else
	 return null;
}
// Appear pop up in center
function PopupCenter(pageURL, title,w,h)
{
	var left = (screen.width/2)-(w/2);
	var top = (screen.height/2)-(h/2);
	var targetWin = window.open (pageURL, title, 'toolbar=no, location=0, directories=no, status=no, menubar=no, scrollbars=no, resizable=no, copyhistory=no, width='+w+', height='+h+', top='+top+', left='+left);
} 

