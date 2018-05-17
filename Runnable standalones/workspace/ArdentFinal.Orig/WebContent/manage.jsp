<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Configure</title>


<style type="text/css">
<!--
body {
	font: 100%/1.4 Verdana, Arial, Helvetica, sans-serif;
	background-color: #FFF;
	margin: 0;
	padding: 0;
	color: #000;
}

/* ~~ Element/tag selectors ~~ */
ul, ol, dl { /* Due to variations between browsers, it's best practices to zero padding and margin on lists. For consistency, you can either specify the amounts you want here, or on the list items (LI, DT, DD) they contain. Remember that what you do here will cascade to the .nav list unless you write a more specific selector. */
	padding: 0;
	margin: 0;
}
h1, h2, h3, h4, h5, h6, p {
	margin-top: 0;	 /* removing the top margin gets around an issue where margins can escape from their containing div. The remaining bottom margin will hold it away from any elements that follow. */
	padding-right: 15px;
	padding-left: 15px; /* adding the padding to the sides of the elements within the divs, instead of the divs themselves, gets rid of any box model math. A nested div with side padding can also be used as an alternate method. */
}
a img { /* this selector removes the default blue border displayed in some browsers around an image when it is surrounded by a link */
	border: none;
}
/* ~~ Styling for your site's links must remain in this order - including the group of selectors that create the hover effect. ~~ */
a:link {
	color: #42413C;
	text-decoration: underline; /* unless you style your links to look extremely unique, it's best to provide underlines for quick visual identification */
}
a:visited {
	color: #6E6C64;
	text-decoration: underline;
}
a:hover, a:active, a:focus { /* this group of selectors will give a keyboard navigator the same hover experience as the person using a mouse. */
	text-decoration: none;
}

/* ~~ this fixed width container surrounds the other divs ~~ */
.container {
	
	; /* the auto value on the sides, coupled with the width, centers the layout */
}

/* ~~ the header is not given a width. It will extend the full width of your layout. It contains an image placeholder that should be replaced with your own linked logo ~~ */

/* ~~ This is the layout information. ~~ 

1) Padding is only placed on the top and/or bottom of the div. The elements within this div have padding on their sides. This saves you from any "box model math". Keep in mind, if you add any side padding or border to the div itself, it will be added to the width you define to create the *total* width. You may also choose to remove the padding on the element in the div and place a second div within it with no width and the padding necessary for your design.

*/

.content {
	background-color:#FFF;
	padding: 10px 0;
}

/* ~~ The footer ~~ */
.footer {
	padding: 10px 0;
	background-color: #CCC49F;
}

/* ~~ miscellaneous float/clear classes ~~ */
.fltrt {  /* this class can be used to float an element right in your page. The floated element must precede the element it should be next to on the page. */
	float: right;
	margin-left: 8px;
}
.fltlft { /* this class can be used to float an element left in your page. The floated element must precede the element it should be next to on the page. */
	float: left;
	margin-right: 8px;
}
.clearfloat { /* this class can be placed on a <br /> or empty div as the final element following the last floated div (within the #container) if the #footer is removed or taken out of the #container */
	clear:both;
	height:0;
	font-size: 1px;
	line-height: 0px;
}
-->
</style></head>

<body>

<div class="container">

	<jsp:include page="header.jsp"/>
    <!-- end .header --></div>
  <div class="content">
    <h1>Instructions</h1>
    <p>If you did not yet Register your profile<a href="examples.jsp" style="background-color:#CCC;padding:2px">Register</a>.</p>
    <h2>Take Note</h2>
    <p>If you have transacted , please take a note of them all. Follow below&darr; </p>
    <p>
    	<label>your Maximum limit for the day is <input name="Man0" type="text" size="20" maxlength="10" /> </label>
    </p>
    <p><input name="Man1" type="text" size="60" placeholder="Enter transaction description" maxlength="50" />
    	
    </p>
    <p>
    	<select name="Man2" size="1">
    	  <option>Commercial</option>
    	  <option value="Food">Food</option>
    	  <option value="Clothing">Clothing</option>
    	  <option value="Travel">Travel</option>
    	  <option value="Payment">Payment</option>
    	  <option value="Others">Others..</option>
    	</select>
        <select name="Man2" size="1">
          <option>Domestic</option>
          <option value="Food">Food</option>
    	  <option value="Clothing">Clothing</option>
    	  <option value="Travel">Travel</option>
    	  <option value="Payment">Payment</option>
    	  <option value="Others">Others..</option>
        </select>
    </p>
    
    <p>
    <input name="Man2" type="text" size="20" placeholder="Enter amount transacted" maxlength="10" />
    </p><input name="Man3" type="submit"  value="Take note" />      <input name="Man3" type="reset"  value="Reset" />
    <p><hr />
    Generate A report &trade;
    <input name="Man4" type="button" value="Generate" />&crarr;
    <!--<h3>Logo Replacement</h3>
    <p>An image placeholder was used in this layout in the .header where you'll likely want to place  a logo. It is recommended that you remove the placeholder and replace it with your own linked logo. </p>
    <p> Be aware that if you use the Property inspector to navigate to your logo image using the SRC field (instead of removing and replacing the placeholder), you should remove the inline background and display properties. These inline styles are only used to make the logo placeholder show up in browsers for demonstration purposes. </p>
    <p>To remove the inline styles, make sure your CSS Styles panel is set to Current. Select the image, and in the Properties pane of the CSS Styles panel, right click and delete the display and background properties. (Of course, you can always go directly into the code and delete the inline styles from the image or placeholder there.)</p>-->
    <!-- end .content -->
    <p></p><p></p>
    <p> <hr />
	<jsp:include page="footer.jsp"/></div>
	</p>
    <!-- end .footer --></div>
  <!-- end .container --></div>
</body>
</html>
