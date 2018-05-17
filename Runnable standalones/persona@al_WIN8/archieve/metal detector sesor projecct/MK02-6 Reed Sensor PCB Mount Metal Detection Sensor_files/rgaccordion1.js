

window.addEvent( 'domready', function(){
  // for each toggleNest
  $$( '.rgaccord1-nest' ).each(function(item){
    var thisSlider = new Fx.Slide( item.getElement( '.rgaccord1-content' ), { duration: 500 } );
    thisSlider.hide();
  
    item.getElement( '.rgaccord1-toggle' ).addEvent( 'click', function(){ 
      thisSlider.toggle(); 

      // add the act class
      if (item.getElement( '.rgaccord1-toggle' ).hasClass('act')) {
        item.getElement( '.rgaccord1-toggle' ).removeClass('act');
      } else {
        item.getElement( '.rgaccord1-toggle' ).addClass('act');
      }
    
    });
  });
});

/*
window.addEvent( 'domready', function(){
  // for each toggleNest
  $$( '.toggleNest' ).each(function(item){
    var thisSlider = new Fx.Slide( item.getElement( '.toggle' ), { duration: 500 } );
    thisSlider.hide();
  
    item.getElement( '.accord' ).addEvent( 'click', function(){ 
      thisSlider.toggle(); 

      // add the act class
      if (item.getElement( '.accord' ).hasClass('act')) {
        item.getElement( '.accord' ).removeClass('act');
      } else {
        item.getElement( '.accord' ).addClass('act');
      }
    
    });
  });
});
*/
