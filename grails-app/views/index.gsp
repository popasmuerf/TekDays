<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>TekDays - The Community is the Conference!!!</title>	
	</head>
	<body>
                <div id="welcome">
                    </br>
                    <h3>Welcome to TekDays.com</h3>
                    <p>TekDays.com is a site dedicated
                       to assisting individuals and communities to organize technology conferences.  
                       To bring great minds with common interests and passions together for the
                       good of greater geekdom!!! </p>
                </div>
                <div id="homeSearch">
                    <g:form
                        controller="tekEvent" action="search">
                        <label>Search:</label><input id="query" type="text" name="query"/>
                        <input type=submit value="Go" />
                    </g:form>
                </div>
                <g:organizerEvents/>
                <g:volunteerEvents/>
                <div class="homeCell">
                    <h3>Find a TekEvent</h3>
                    <p>See if there's a technical event in the works that strikes your interest.
                       If there is, you can  volunteer to help or just let the organizers know
                       that your'd be interested in attending.  Everybody has a role to play.</p>
                    <span class="buttons">
                     <g:link controller="tekEvent" action="index">Find a TekEvent</g:link>
                    </span>
                </div>
                <div class="homeCell">
                    <h3>Organize a Tek Event</h3>
                    <p>If by chance you don't see anything
                       that suits your interest and location, then why not get the ball rolling yourself ?
                       It's easy to get started and there
                       may be others out there ready to
                       get behind you in order to make 
                       things happen!!!</p>
                    <span class="buttons">
                     <g:link controller="tekEvent" action="create">Organize a TekEvent</g:link>
                    </span>
                </div>
                <div class="homeCell">
                    <h3>Sponsor a Tek Event</h3>
                    <p>If you are part of a business
                       or organization that is involved
                       in technology then sponsoring
                       a TekEvent would be a great way
                       to let the community know that you
                       are involved.  </p>
                    <span class="buttons">
                     <g:link controller="sponsor" action="create">Sponsor a TekEvent</g:link>
                    </span>
                </div>

	</body>
</html>
