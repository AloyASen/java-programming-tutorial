(function(settings) {
    var cookieDomain = settings.cookieDomain;
    var affiliateSite = settings.affiliateSite;
    String.prototype.trim = function() {
        return this.replace(/(^\s*)|(\s*$)/g, "");
    }
    var cookie = function(name, value, options) {
        if (typeof value != 'undefined') { // name and value given, set cookie
            options = options || {};
            if (value === null) {
                value = '';
                options.expires = -1;
            }
            var expires = '';
            if (options.expires && (typeof options.expires == 'number' || options.expires.toUTCString)) {
                var date;
                if (typeof options.expires == 'number') {
                    date = new Date();
                    date.setTime(date.getTime() + (options.expires * 24 * 60 * 60 * 1000));
                } else {
                    date = options.expires;
                }
                expires = '; expires=' + date.toUTCString(); // use expires attribute, max-age is not supported by IE
            }
            // CAUTION: Needed to parenthesize options.path and options.domain
            // in the following expressions, otherwise they evaluate to undefined
            // in the packed version for some reason...
            var path = options.path ? '; path=' + (options.path) : '';
            var domain = options.domain ? '; domain=' + (options.domain) : '';
            var secure = options.secure ? '; secure' : '';
            //document.cookie = [name, '=', encodeURIComponent(value), expires, path, domain, secure].join('');
            document.cookie = [name, '=', value, expires, path, domain, secure].join('');
        } else { // only name given, get cookie
            var cookieValue = null;
            if (document.cookie && document.cookie != '') {
                var cookies = document.cookie.split(';');
                for (var i = 0; i < cookies.length; i++) {
                    var cookie = cookies[i].trim();
                    // Does this cookie string begin with the name we want?
                    if (cookie.substring(0, name.length + 1) == (name + '=')) {
                        cookieValue = decodeURIComponent(cookie.substring(name.length + 1));
                        break;
                    }
                }
            }
            return cookieValue;
        }
    };
    var refererUrl = document.referrer;
    if (refererUrl != '') {
        var siteIdCookiesName = "Utm_rid";
        var affiliateParams = "Utm_params";
        for (var i = 0; i < affiliateSite.length; i++) {
            var site = affiliateSite[i];
            if (refererUrl.indexOf('http://' + site.site) == 0 || refererUrl.indexOf('https://' + site.site) == 0) {
                cookie(siteIdCookiesName, site.siteId, {
                    expires: site.expires,
                    path: "/",
                    domain: cookieDomain
                });
                var url = document.URL;
                var index = url.indexOf('?');
                if (index > 0 && index < url.length - 1) {
                    var queryParams = url.substr(index + 1);
                    cookie(affiliateParams, queryParams, {
                        expires: site.expires,
                        path: "/",
                        domain: cookieDomain
                    });
                }
            }
        }
    }
})({"cookieDomain":".dx.com","affiliateSite":[{"siteId":"26328740","site":"www.facebook.com","expires":30},{"siteId":"78699130","site":"n.actionpay.ru","expires":45},{"siteId":"28296997","site":"www.shareasale.com","expires":30}]});