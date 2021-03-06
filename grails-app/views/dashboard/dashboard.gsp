<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>TekEvent Dashboard</title>	
	</head>
	<body>
                <!--========Menu Start=========== -->
                <div class="nav" role="navigation">
                    <ul>
                        <li><a class="home" href="${createLink(uri:'/')}">Home</a></li>
                         <li><g:link class="create" controller="task" action="create">Create Task</g:link></li>
                        <li><g:link class="create" controller="sponsorship" action="create">Add Sponsor</g:link></li>
                        <li><g:link class="list" controller="sponsor" action="index">All Sponsors</g:link></li>
                    </ul>
                </div>
                <!--========Menu End=========== -->

                <!--========Start Render Templates=========== -->
                <div id="event" style="margin:10px 10px 10px">
                     <g:render template="event" model="${['event':event]}"/>
                </div>
                <div id="tasks" style="margin:10px 10px 10px">
                     <g:render template="tasks" model="${['tasks':tasks]}"/>
                </div>
                <div id="volunteers" style="margin:10px 10px 10px">
                     <g:render template="volunteers" model="${['volunteers':volunteers]}"/>
                </div>
                <div id="messages" style="margin:10px 10px 10px">
                     <g:render template="messages" model="${['messages':messages]}"/>
                </div>
                <div id="sponsors" style="margin:10px 10px 10px">
                     <g:render template="sponsors" model="${['sponsors':sponsors]}"/>
                </div>
	</body>
</html>
