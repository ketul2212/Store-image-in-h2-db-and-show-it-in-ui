<!Doctype html>
<html>
    <head>
        <title>Get Image</title>
    </head>

    <body>
    	<form action="./reg" method = "POST" enctype="multipart/form-data">
        <table>
        	<tr>
                <td>ID:</td>
                <td><input type="text" name="eid" /></td>
            </tr>

			<tr>
				<td>Image:</td>
                <td><input type="file" name="eimage" /></td>
			
			</tr>           

            <tr>
                <td></td>
                <td><input type="submit" name="submit" /></td>
            </tr>
        </table>
        </form>
        
        <form action="./show" method = "GET">
        <table>
        	<tr>
                <td>ID:</td>
                <td><input type="text" name="eid" /></td>
            </tr> 

            <tr>
                <td></td>
                <td><input type="submit" name="submit" /></td>
            </tr>
        </table>
        </form>
        
        <form action="./all">
        	<input type="submit" name="submit" value="show entry" />
        </form>
        
        <h1>${employee}</h1>
    </body>
</html>