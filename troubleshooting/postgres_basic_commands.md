# PostgreSQL Database Connection and Basic Commands

## Check PostgreSQL Service Status

1. Check the status of the PostgreSQL service:

   `sudo service postgresql status`

2. If the service is down, start it:

   `sudo service postgresql start`

## Connect to PostgreSQL Shell

1. Run the following command to connect to the PostgreSQL shell:

   `psql -U postgres`

2. If the connection fails, follow the troubleshooting instructions in `/lc-api/troubleshooting/postgres_peer_auth_fix.md`.

3. After fixing the issue, run `psql` again.

## View Databases

In the PostgreSQL shell:

- To list databases, use either of the following commands:

  `\l` or `\list`

  Additionally, you can use the SQL query:

  `SELECT datname FROM pg_database;`

## Basic Database Commands

- Connect to a specific database:

  `\c database_name`

- View all tables in the current database:

  `\dt`

- Fetch all values from a table:

  `SELECT * FROM table_name;`

- Other basic commands:

  - Exit the PostgreSQL shell:

    `\q`

  - Get help:

    `\h`

  - View command history:

    `\s`

  - Clear the screen:

    `\!`

Feel free to explore more commands based on your specific needs.
